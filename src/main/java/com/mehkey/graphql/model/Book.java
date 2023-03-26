

@Entity
public class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 private String description;
 private String Author;
 
 @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
 @JoinColumn(name = "book_id")
    private List<BookComment> comments = new ArrayList<>();
}