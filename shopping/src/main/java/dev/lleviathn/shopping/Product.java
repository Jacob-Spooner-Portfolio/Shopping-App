package dev.lleviathn.shopping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    @Id
    private ObjectId _id;
    private String title;
    private String url;
    private String Brand;
    private String main_image;
    private int sku;
    private String description;
    private String raw_description;
    private String currency;
    private int price;
    private String availability;
    private String primary_category;
    private String sub_category;
    private String images;
    private List<String> raw_specifications;
    private List<String> specification;
    private String highlights;
    private String raw_highlights;
    private String uniq_id;


}
