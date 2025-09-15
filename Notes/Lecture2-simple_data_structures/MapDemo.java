public class MapDemo {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map);
        int x = map.get("b");
        System.out.println(x);
    }
}
