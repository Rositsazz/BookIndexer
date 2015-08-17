# BookIndexer
Book's index table

Java project with the purpose to generate an index table in an output file.

The file must always start with the string "INDEX"
The next n lines contain the locations of each of the n keywords, sorted alphabetically:

* Each line must start with the keyword itself, followed by a comma and a space
* The indexes of the words follow. If a word is found several times, display them all separated by commas. If a word is found on consequent pages display the range of pages with a dash as in 150-152 instead of 150, 151, 152.
* The indexer is case-insenstive - consider "Hello" and "hello" are the same word.
    
Here's an example:

Contents of the book file:
```
=== Page 1 ===
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut rhoncus non odio sed ultricies. Pellentesque dui metus, cursus at neque eget, sollicitudin sagittis lorem. Nullam semper ex et rutrum tincidunt.

=== Page 2 ===
Aenean porta velit et ex fermentum, vitae finibus diam elementum. Vivamus dapibus purus dolor, quis ultricies orci ornare eu. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Quisque sed purus rhoncus, dignissim nunc non, laoreet tortor. 

== Page 3 ===
Integer blandit sem nulla, in pretium augue finibus quis. Ut elementum augue vel dignissim accumsan. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec blandit libero.
```
Keywords:
```
String[] keywords = new String[] { "lorem", "quisque", "aenean" };
```

Then the output index file should look like this:
```
INDEX
aenean, 2
lorem, 1, 3
quisque, 2-3
```
