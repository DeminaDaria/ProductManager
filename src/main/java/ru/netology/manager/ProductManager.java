package ru.netology.manager;


import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager() {
    }

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];

        for (Product product : repository.getAll()) {
            if (matches(product, text)) {

                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
    return result;
    }

    public boolean matches(Product product, String search) {

        if (product instanceof Book) {
            Book book = (Book) product;

            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }

            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }
        }

        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;

            if (smartphone.getName().equalsIgnoreCase(search)) {
                return true;
            }

            if (smartphone.getMaker().equalsIgnoreCase(search)) {
                return true;
            }
        }
        return false;
    }
}
