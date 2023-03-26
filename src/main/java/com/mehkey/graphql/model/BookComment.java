@Entity
public class BookComment { 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 private String comentContent;

 public BookComments() {
  super();
  
 }
}