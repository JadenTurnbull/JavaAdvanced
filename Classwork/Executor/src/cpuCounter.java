public class cpuCounter {
    public static void main(String[] args) {
        int cpuCount = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuCount);
    }
}
