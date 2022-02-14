public static <E, I extends Iterable<E>> void print(I obj){
    System.out.print("[");
    ArrayList<String> wynik = new ArrayList<>();
    Iterator iter = obj.iterator();
    while(iter.hasNext()){
        wynik.add(iter.next().toString());
    }
    System.out.print(String.join(",",wynik));
    System.out.print("]\n");
}
