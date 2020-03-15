public class Main {

    public static void main(String[] args) {
        ArrayDictionary a = new ArrayDictionary(6);
        for(int i = 0; i < 30; i++){
            a.add(i,i);
        }
        System.out.println(a.remove(0));
        System.out.println(a.remove(12));
        System.out.println(a.remove(30));
        System.out.println(a.contains(18));
        System.out.println(a.contains(30));
    }
}
