# Assignment 2

Task : create classes MyArrayList and MyLinkedList which are implementations of ArrayList and LinkedList respectively.

Both ArrayList and LinkedList are of generic type (E)

ArrayList :
- ArrayList is a variable length Collection class
- private instance variable of type Object[] was used to hold the elements of the list(can store more abstract values).
- public MyArrayList() - declaration
- public E get(int index) - accessing the data
- public void add(E newItem) - adding new items
- increaseBuffer(buffer method) - when you exceed capacity and add more numbers in array list, it will not show a mistake and is going to increase a capacity by itself
- get(int index) -  method by returning the element at the specified index
- size() method - returning the size variable
- remove(int index) method - removing the element at the specified index

LinkedList :
- A linked list is a series of connected nodes
- Node - is an object that must hold a value and some references to other nodes
- LinkedList in this task is doubly-linked type
- head - instance variable, that references the first node in the list
- tail- instance variable, that references the last node in the list
-.next - iteration of next elemenet
- public E get(int index) - accessing the data
- public void add(E newItem) - adding new items
- get(int index) -  method by returning the element at the specified index
- size() method - returning the size variable
- remove(int index) method - removing the element at the specified index

