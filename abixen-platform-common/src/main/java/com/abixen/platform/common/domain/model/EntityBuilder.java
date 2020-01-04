/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.common.domain.model;


public abstract class EntityBuilder<T> {

    protected T product;

    public EntityBuilder() {
        initProduct();
    }

    public final T build() {
        final T temp = assembleProduct();
        if (temp == null) {
            throw new IllegalStateException("Only single build() call is allowed");
        }
        this.product = null;

        return temp;
    }

    protected abstract void initProduct();

    protected T assembleProduct() {
        return this.product;
    }

}