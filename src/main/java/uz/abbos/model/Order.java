package uz.abbos;

import java.util.List;

public record Order(Integer buyerId,
                    List<Product> products) {
}
