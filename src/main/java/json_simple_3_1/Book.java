package json_simple_3_1;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Book implements Jsonable {

   private String title;
   private String isbn;
   private long year;
   private String[] authors;

   public Book() {
   }


   public Book(String title, String isbn, long year, String[] authors) {
      this.title = title;
      this.isbn = isbn;
      this.year = year;
      this.authors = authors;
   }


   public String getTitle() {
      return title;
   }


   public void setTitle(String title) {
      this.title = title;
   }


   public String getIsbn() {
      return isbn;
   }


   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }


   public long getYear() {
      return year;
   }


   public void setYear(long year) {
      this.year = year;
   }


   public String[] getAuthors() {
      return authors;
   }


   public void setAuthors(String[] authors) {
      this.authors = authors;
   }


   @Override
   public int hashCode() {
      int hash = 5;
      hash = 29 * hash + Objects.hashCode(this.title);
      hash = 29 * hash + Objects.hashCode(this.isbn);
      hash = 29 * hash + (int) (this.year ^ (this.year >>> 32));
      hash = 29 * hash + Arrays.deepHashCode(this.authors);
      return hash;
   }


   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Book other = (Book) obj;
      if (this.year != other.year) {
         return false;
      }
      if (!Objects.equals(this.title, other.title)) {
         return false;
      }
      if (!Objects.equals(this.isbn, other.isbn)) {
         return false;
      }
      if (!Arrays.deepEquals(this.authors, other.authors)) {
         return false;
      }
      return true;
   }


   @Override
   public String toString() {
      return "Book{" + "title=" + title + ", isbn=" + isbn + ", year=" + year +
              ", authors=" + authors + '}';
   }


   /**
    * To parse from object Java to object JSON
    *
    * @return
    */
   @Override
   public String toJson() {
      JsonObject json = new JsonObject();
      json.put("title", this.title);
      json.put("isbn", this.isbn);
      json.put("year", this.year);
      json.put("authors", this.authors);
      return json.toJson();
   }


   /**
    * To write an Object json into a file
    *
    */
   @Override
   public void toJson(Writer writable) throws IOException {
      try {
         writable.write(this.toJson());
      } catch (Exception ignored) {
      }
   }


}

