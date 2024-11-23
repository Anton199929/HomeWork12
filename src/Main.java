//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author bookAuthor1 = new Author("Стивен", "Кинг");
        Author bookAuthor2 = new Author("Глен", "Кук");
        Book book1 = new Book("Оно", bookAuthor1, 1986);
        Book book2 = new Book("Черный отряд", bookAuthor2, 1983);
        book2.setYearOfPublication(1984);
        System.out.println(book1);
        System.out.println(book2);

    }
}