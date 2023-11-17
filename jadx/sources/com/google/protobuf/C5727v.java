package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.v */
class C5727v implements Iterator {

    /* renamed from: d */
    private Iterator f18097d;

    public C5727v(Iterator it) {
        this.f18097d = it;
    }

    /* renamed from: b */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f18097d.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.f18097d.hasNext();
    }

    public void remove() {
        this.f18097d.remove();
    }
}
