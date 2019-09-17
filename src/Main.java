import java.util.*;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Sorter sorter = new Sorter();
        Printer printer = new Printer();
        List<String> words = new ArrayList<>(computer.splitExcept(Lines.TEXT.toString(), "[?!.,-]", " "));
        System.out.println("Слов в тексте: " + words.size());
        Map<String, Integer> wordsRepeats = new LinkedHashMap<>(computer.countRepeatable(words));
        sorter.sort(wordsRepeats);
        System.out.println("Самые редкие слова: " + printer.getElements(wordsRepeats, 3));
        sorter.reverse(wordsRepeats);
        System.out.println("Самые частые слова: " + printer.getElements(wordsRepeats, 5));

        System.out.println("Символов в тексте без пробелов: " + computer.splitExcept(Lines.TEXT.toString(), " ", "").size());

        System.out.print("Введите текст для инверсии: ");
        String text = new Scanner(System.in).nextLine().trim();
        List<String> reversedList = new ArrayList<>(computer.splitExcept(text, "[?!.,]", " "));
        Collections.reverse(reversedList);
        System.out.print("Текст \"" + text + "\" в обратном порядке - ");
        for (String item: reversedList) System.out.print(item + " ");
    }
}
