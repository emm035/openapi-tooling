package com.github.emm035.openapi.schema.generator.extension;

import com.github.emm035.openapi.core.v3.schemas.Schema;

@FunctionalInterface
interface Extension<T> {
  Schema modify(Schema schema, T data);
}
