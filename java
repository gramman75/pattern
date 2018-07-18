	String -> String Stream	Arrays.asList(resultString.split("")).stream().forEach(s -> resultBuilder.append(s));
	Array -> List	Arrays.asList( array)
	int Array -> int	// int Array->Stream->Integer -> String -> joing -> int
		int r1 = Integer.parseInt(Arrays.stream(list1).boxed().map(i -> String.valueOf(i)).collect(Collectors.joining()));
	int -> int Array	// int -> string -> string[] -> Integer -> int -> array
		int[] r2 = Arrays.stream(String.valueOf(r1).split("")).map(s-> Integer.parseInt(s)).mapToInt(i->i).toArray();
	String -> int Array	int[] intArray = Arrays.stream(str.split("")).map(Integer::new).mapToInt(i->i).toArray();
	int Array -> Integer List	List<Integer> result1 = Arrays.stream(list1).boxed().collect(Collectors.toList());
	Integer List -> int Array	int[] array = list.stream().mapToInt(i->i).toArray();
	String -> Character	s.charAt(0);
	Character -> String	"" + s
	Max값 구하기	Integer r = list.stream().max((a,b) -> Integer.compare(a, b)).get();
		Integer x = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		        
	Integer -> int	Integer i = new Integer(123);
		i.intValue();
