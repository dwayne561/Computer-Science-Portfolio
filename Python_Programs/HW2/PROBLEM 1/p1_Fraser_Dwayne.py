# DWAYNE FRASER
# PROBLEM 1
# Part A
def line_number(input_file, output_file):
    """ This Function Will Number Each Line of Input File & Writes to Output    
    input_file : TYPE - Python File
        DESCRIPTION - Reads Input from File
    output_file : TYPE - Text File
        DESCRIPTION - Writes Output to File
    Returns - None
    """
    try:
        input_file = open(input_file, "r") # OPENS INPUT FILE STREAM (READ)
        output_file = open(output_file, "w") # OPENS OUTPUT FILE STREAM (WRITE)
    
        line_number = 1 # STARTS FIRST LINE
        
        for x in input_file: # LOOP
            output_file.write(str(line_number) + ". ") # PRINTS WHAT LINE
            output_file.write(x) # PRINTS LINE CONTENTS
            line_number = line_number + 1 # INCREMENTS
        
        input_file.close() # CLOSES INPUT FILE STREAM
        output_file.close() # CLOSES OUTPUT FILE STREAM   
    
    except Exception as E:
        print("There was an error. Please try again")
        raise E

# Part B
def parse_functions(python_file):
    """ This function fill parse a file and store particular contents in a tuple of tuples
    python_file : TYPE - Python File
    Returns - None.
    """
    python_file = open(python_file,'r') # OPENS PYTHON FILE (READ)
    code_lines = python_file.readlines() # STORES CONTENTS AS LIST DATA TYPE
    
     # FINDS THE FUNCTION NAME AND STORES IT IN A LIST
    function_name_list = []
    function_name_list_sorted = []
    for line in code_lines: # LOOP
        find_def = line.find('def ')
        if find_def != -1:  # IF THE SEARCH STRING IS FOUND...
          start_index = len('def ')
          end_index = line.find('(') # FIND WHERE THE FUNCTION NAME ENDS
          function_name_list.append(line[start_index:end_index]) # STORE IN A LIST
    function_name_list_sorted = sorted(function_name_list)

    # FINDS THE LINE NUMBER AND THE FUNCTION CODE
    function_line_number_list = []
    function_code_list = []
    line_count = 0
    for index in range(len(function_name_list)):
        for line in code_lines: # LOOP
            line_count += 1
            find_line_number = line.find(function_name_list_sorted[index])
            if find_line_number != -1:  # IF THE SEARCH STRING IS FOUND...
              function_line_number_list.append(line_count) # STORE IN A LIST
              function_code_list.append(line)
              line_count = 0
              break       
    
    # ARRANGES ELEMENTS IN A TUPLE OF TUPLES
    elements_list = []

    for index in range(len(function_name_list)):
        elements = (function_name_list_sorted[index], function_line_number_list[index], function_code_list[index])
        elements_list.append(elements)
    tuple_of_tuples = tuple(elements_list)    
    print(tuple_of_tuples)
    
def main():
    line_number("test.py", "test.py.txt")
    parse_functions("funs.py")
main()