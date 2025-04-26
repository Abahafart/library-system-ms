package com.arch.catalogue.domain.rest.response;

import java.time.Instant;

public record BookResponse(long bookId, String title, String ISBN, String language, int numberOfPages, AuthorResponse author, Instant createdAt, Instant updatedAt, int version) {

}
