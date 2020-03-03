public class BookShelfIterator implements MyIterator {
  private BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  public boolean hasNext() {
    if (index < bookShelf.getLength()) {
      return true;
    }

    return false;
  }

  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index++;

    return book;
  }
}