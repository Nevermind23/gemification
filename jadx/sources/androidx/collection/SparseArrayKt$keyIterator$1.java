package androidx.collection;

import ie1.C41330k0;

public final class SparseArrayKt$keyIterator$1 extends C41330k0 {
    final /* synthetic */ SparseArrayCompat $this_keyIterator;
    private int index;

    SparseArrayKt$keyIterator$1(SparseArrayCompat<T> sparseArrayCompat) {
        this.$this_keyIterator = sparseArrayCompat;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_keyIterator.size();
    }

    public int nextInt() {
        SparseArrayCompat sparseArrayCompat = this.$this_keyIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseArrayCompat.keyAt(i);
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
