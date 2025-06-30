package com.crudao.crudi.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity(name = "product") // Nome da entidade no contexto JPA
@Table(name = "product")  // Nome da tabela no banco de dados
public class Product {

    @Id // Marca o campo 'id' como a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o banco de dados gerará o ID (ex: auto_increment)
    @Column(name = "id") // Mapeia o campo 'id' para a coluna 'id' no banco (opcional se nomes forem iguais)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name= "price")
    private Long price;

    // Construtor vazio (NO-ARG CONSTRUCTOR) - OBRIGATÓRIO para JPA
    public Product() {

    }

    public Product(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" +id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
