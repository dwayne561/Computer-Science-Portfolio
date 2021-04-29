# DWAYNE FRASER
# PROBLEM 3

contact_list = [] # CONTACT LIST DECLARATION

# Part A
def contact_list_add(full_name, nick_name, phone_number):
    
    for i in range(len(contact_list)): # LOOP
        if(contact_list[i][0] == full_name): #  IF CONTACT NAME IS IN LIST THEN...
            contact_list[i] = (full_name, nick_name, phone_number) # CHANGES EXISTING CONTACT TO NEW ENTRY
            return False # RETURNS BOOLEAN
       
    contact_list.append((full_name, nick_name, phone_number)) # ADD CONTACT

    return True # RETURNS BOOLEAN

#Part B
def contact_list_remove(full_name, nick_name, phone_number):

    for i in range(len(contact_list)): # LOOP
        if(contact_list[i][0] == full_name): #  IF CONTACT NAME IS IN LIST THEN...
            x = i
            contact_list.pop(x)
            return True # RETURNS BOOLEAN
    
    return False # RETURNS BOOLEAN

#Part C
def contact_list_find(full_name): 
    for i in contact_list: # LOOP
        if full_name in i: #  IF CONTACT NAME IS IN LIST THEN...
            return i # RETURNS VALUE
        else: 
            return None
        
#Part D
def contact_list_save(file_name):
   f = open(file_name, "w") # OPENS FILE AS W
   for i in contact_list: # LOOP
       f.write("{}, {}, {}".format(i[0], i[1], i[2])) # WRITES TO FILE


#Part E
def contact_list_read(file_name):
   f = open(file_name,"r") # OPENS FILE AS R
   line = f.readline()
   contacts_list = []
   while(line): # LOOP
       contacts_list.append(tuple(line.split(", "))) #GETS INFO
       line = f.readline() 

   return contacts_list

#Part F
def main():
    contact_list_add("Beyonce Knowels", "Bey", "561-1234321")
    contact_list_add("Cardi B", "Belcalis", "305-4399521")
    contact_list_add("Earl Simmons", "DMX", "305-1010101")
    print("LIST AFTER ADD: ", contact_list)
    
    contact_list_remove("Cardi B", "Belcalis", "305-4399521") 
    print("LIST AFTER REMOVAL: ", contact_list)
    
    print("FIND CONTACT", contact_list_find(full_name = "Beyonce Knowels"))

    contact_list_save("Contact_list_file.csv")
    print("LIST AFTER SAVE: ", contact_list_read("contact_list_file.csv"))
    
main()