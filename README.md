# Word-Frequency with Hash-Maps
This is a word frequency program for txt files in Java - using the 'stdlib' library.
The program uses hash maps to store each word and then increment the mapped value if it is found again. 
All words are made to be lowercased and stripped of punctuation. 
The list is sorted in ascending order so the largest ones appear at the bottom of the terminal when you run the code. 
To sort the data I had to sort the hash map by value, which is done by making the hash map into a list and sorting it in that structure then reversing it back to a hash map. 
