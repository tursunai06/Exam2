public class Main {
    public static void main(String[] args) {
        Author author = new Author("Чынгыз Айтматов", "aitmatovgmail.com", 'м');
        Author author1 = new Author("Aнтон Чехов", "antongmail.com", 'м');
        Book book = new Book("Кылым карытар бир кун", 1000, 0, author);
        Book book1 = new Book("Пересолил", 500, 0, author1);
        System.out.println(author);
        System.out.println(author1);
        System.out.println(book);
        System.out.println(book1);
    }
}