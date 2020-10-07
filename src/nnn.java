public class nnn {
    public static String textGrade(int grade){
        String a = "не оценено", b = "очень плохо", c = "плохо", d = "удовлетворительно", e = "хорошо", f = "отлично", n = "не определено";
        if (1 <= grade & grade <= 20) {
            return b;}
        if (21 <= grade & grade <= 40) {
            return c;}
        if (41 <= grade & grade <= 60) {
            return d;}
        if (61 <= grade & grade <= 80) {
            return e;}
        if (81 <= grade & grade <= 100) {
            return f;}
        if (grade > 100) {
            return n;
        }
        else return a;
    }
     }
class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("class это программа на Java");
    }
}

