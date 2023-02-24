public class Main {
    public static void main(String[] args) {
        Author author = new Author("Чынгыз Айтматов", "aitmatovgmail.com", 'm');
        Author author1 = new Author("Aнтон Чехов", "antongmail.com", 'm');
        Author author2 = new Author("Алыкул Осмонов", "osmonovgmail.com", 'm');
        Book book = new Book("Кылым карытар бир кун", 1000, 0, author);
        Book book1 = new Book("Пересолил", 500, 0, author1);
        Book book2 = new Book("Ырлар жыйнагы", 800, 0, author2);

        Book[] books = {book, book1, book2};
        for (Book book3 : books) {
            System.out.println(book3);


            }

        }

    }
