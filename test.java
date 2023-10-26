public class test {
    public static void main(String[] args) {
        String a = "Доборо пожаловать на Java курс";
        String[] array = a.split(" ");
        for (int i=array.length-1; i>=0; i--) {
            System.out.println(array[i]);


        }
    }
}