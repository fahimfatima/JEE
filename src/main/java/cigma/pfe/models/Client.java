package cigma.pfe.models;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    public Client(String name) {
        this.name = name;
    }
    public Client() {
    }
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    public Client(String name) {
        this.name = name;
    }
    public Client() {
    }

     */
}

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private List<Facture> factures;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
            name = "client_fk",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_fk", referencedColumnName = "id"))
    private List<Promotion> promotions;
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;
    public Client() {
    }
    public Client(String name) {
        this.name = name;
    }

}

     */
