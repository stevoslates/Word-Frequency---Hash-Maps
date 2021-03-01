# Word-Frequency with Hash-Maps
This is a word frequency program for txt files in Java - using the 'stdlib' library.

There are two different features - Word Count Frequency and Word Length Frequency.

For Word Count Frequency:
The program uses hash maps to store each word and then increment the mapped value if it is found again. 
All words are made to be lowercased and stripped of punctuation (using regex). 
The list is sorted in ascending order so the largest ones appear at the bottom of the terminal when you run the code. 
To sort the data I had to sort the hash map by value, which is done by making the hash map into a list and sorting it in that structure then reversing it back to a hash map. 

For Word Length Frequency:
The wordLengthFrequency class uses the token class and this then uses hashmaps to display the amount of words that have that specific lengths. eg {1=123,2=475,3=4850,4=3840}
