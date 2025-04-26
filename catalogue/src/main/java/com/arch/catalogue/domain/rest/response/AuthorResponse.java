package com.arch.catalogue.domain.rest.response;

import java.time.Instant;

public record AuthorResponse(long authorId, String name, String description, Instant createdAt, Instant updatedAt, int version) {
    public AuthorResponse(long authorId) {
        this(authorId, null, null, null, null, 0);
    }
}
