package com.example.BookShop.mapper;

import com.example.BookShop.dto.BookDto;
import com.example.BookShop.model.Book;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto toDto(Book book);

    Book toEntity(BookDto bookDto);

    List<BookDto> toDtoList(List<Book> books);

}
