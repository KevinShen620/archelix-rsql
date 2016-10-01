/*
* MIT License
*
* Copyright (c) 2016 John Michael Vincent S. Rustia
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*/
package com.github.vineey.rql.filter;

/**
 * @author vrustia on 9/26/2015.
 */
public class FilterContext<T, E extends FilterParam> {
    private FilterVisitor<T, E> filterVisitor;
    private E filterParam;

    public static <T, E extends FilterParam> FilterContext<T, E> withBuilderAndParam(FilterVisitor<T, E> builder, E filterParam) {
        return new FilterContext<T, E>()
                .setFilterVisitor(builder)
                .setFilterParam(filterParam);
    }

    public FilterVisitor<T, E> getFilterVisitor() {
        return filterVisitor;
    }

    public FilterContext setFilterVisitor(FilterVisitor<T, E> filterVisitor) {
        this.filterVisitor = filterVisitor;
        return this;
    }

    public E getFilterParam() {
        return filterParam;
    }

    public FilterContext setFilterParam(E filterParam) {
        this.filterParam = filterParam;
        return this;
    }
}
