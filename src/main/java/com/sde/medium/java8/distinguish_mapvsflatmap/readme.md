Differences between Java 8 Map() Vs flatMap() :

| map()                                                                                       | 	                                    flatMap()                                              |
|:--------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------|
| It processes stream of values.	                                                             | It processes stream of stream of values.                                                    |                                                              
| It does only mapping.	                                                                      | It performs mapping as well as flattening.                                                  |                                                            
| It’s mapper function produces   single value for each input value.	                         | It’s mapper function produces multiple values for each input value.                         |
| It is a One-To-One mapping.	                                                                | It is a One-To-Many mapping.                                                                |                                                                         
| Data Transformation : From Stream to Stream	Data Transformation                             | : From Stream<Stream> to Stream                                                             |                                                                         
| Use this method when the mapper function is producing a single value for each input value.	 | Use this method when the mapper function is producing multiple values for each input value. |            


```<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);```

```Returns a stream consisting of the results of replacing each element of this stream
with the contents of a mapped stream produced by applying the provided mapping function 
to each element. Each mapped stream is closed after its contents have been placed into 
this stream. (If a mapped stream is null an empty stream is used, instead.)
This is an intermediate operation.

Params:
mapper – a non-interfering, stateless function to apply to each element which produces 
a stream of new values

Returns:
the new stream
API Note:
The flatMap() operation has the effect of applying a one-to-many transformation to the 
elements of the stream, and then flattening the resulting elements into a new stream.
Examples.
If orders is a stream of purchase orders, and each purchase order contains a collection
of line items, then the following produces a stream containing all the line items in 
all the orders:
orders.flatMap(order -> order.getLineItems().stream())...
If path is the path to a file, then the following produces a stream of the words 
contained in that file:
Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);  
Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
The mapper function passed to flatMap splits a line, using a simple regular expression,
into an array of words, and then creates a stream of words from that array.