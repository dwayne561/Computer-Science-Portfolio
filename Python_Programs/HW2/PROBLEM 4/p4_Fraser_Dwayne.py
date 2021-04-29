# DWAYNE FRASER
# PROBLEM 4

import pandas as pd 

top_gross = pd.read_csv('imdb-top-grossing.csv') # READ CSV
top_gross.columns =['Rank', 'Title', 'Year', 'USA Box Office']
top_rated = pd.read_csv('imdb-top-rated.csv') # READ CSV
top_rated.column = ['Rank', 'Title', 'Year', 'IMDB Rating']
cast = pd.read_csv('imdb-top-casts.csv', header = None) # READ CSV
cast.columns = ['Title', 'Year', 'Director', 'Actor1', 'Actor2', 'Actor3', 'Actor4', 'Actor5'] # READ CSV

# PART A
def display_top_collaborations():
    """ displays the ranking of tuples (director, first
    billed actor (i.e. Actor1), and number of movies) for movies in which the director and actor worked
    together also listed in the top rated movie list.
    """
    data = dict()  # DICTIONARY DECLARATION
    Results = []  

    for index, row in top_rated.iterrows(): # LOOP
    
        Title = row['Title'] # TITLE ROW ASSIGNMENT
        MovieTitle = cast.loc[cast['Title'] == Title]  # MOVIE TITLE ASSIGNMENT
        
        if ((MovieTitle.iloc[0]['Director'],MovieTitle.iloc[0]['Actor1']) in data): # IF ACTOR & DIRECTOR IN MOVIE THEN...
            data[(MovieTitle.iloc[0]['Director'],MovieTitle.iloc[0]['Actor1'])] = data[(MovieTitle.iloc[0]['Director'],MovieTitle.iloc[0]['Actor1'])] + 1 # ASSIGNMENT OPERATION  
        else:
            data[(MovieTitle.iloc[0]['Director'],MovieTitle.iloc[0]['Actor1'])] = 1
            
    for key, value in data.items(): # LOOP
        a, b = key
        Results.append((a, b, value))     # LIST TUPLE APPEND
        
    Results = sorted(Results, key = lambda i: i[2] ) # SORT
    print("\nMovies in which the director and actor worked together also listed in the top top_rated movie list\n")
    
    for i in range(50): # LOOP
        print(Results[i]) # PRINT
        
    return

# PART B
def display_top_directors():
    """ displays the ranking of movie directors from the
    top grossing list ordered by the total box office money they produced.
    """

    data = dict()   # DICTIONARY DECLARATION
    Results = []
        
    for index, row in top_gross.iterrows(): # LOOP
        Title = row['Title']  # TITLE ROW ASSIGNMENT
        top_gross_income = row['USA Box Office'] # TOP GROSS INCOME ROW ASSIGNMENT
        Movie_Name = cast.loc[cast['Title'] == Title]      # MOVIE NAME ASSIGNMENT
        
        if (Movie_Name.iloc[0]['Director'] in data): # IF DIRECTOR IN MOVIE THEN...
            data[Movie_Name.iloc[0]['Director']] = data[Movie_Name.iloc[0]['Director']] + top_gross_income # ASSIGNMENT OPERATION   
        else:
            data[Movie_Name.iloc[0]['Director']] = top_gross_income 
            
    for key, value in data.items(): # LOOP
        Results.append((key, value))        # LIST TUPLE APPEND
        
    Results = sorted(Results, key = lambda i: i[1]) # SORT
    print("\nThe ranking of movie directors from the top top_grossing list ordered by the total box office money they produced.\n")
    
    for i in range(50): # LOOP
       print(Results[i])
       
    return

# PART C
def main():
      
    display_top_collaborations()
    display_top_directors()  

main()