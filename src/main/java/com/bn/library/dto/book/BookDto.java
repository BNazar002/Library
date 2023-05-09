package com.bn.library.dto.book;

import com.bn.library.dto.author.AuthorDto;
import com.bn.library.dto.publisher.PublisherDto;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class BookDto {
    private int id;
    private String title;
    private AuthorDto author;
    private String photoUrl;
    private PublisherDto publisher;
    private int publicationYear;
    private int pageCount;
    private BigDecimal price;
}
