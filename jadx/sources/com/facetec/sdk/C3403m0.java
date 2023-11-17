package com.facetec.sdk;

import android.util.Size;
import java.util.Comparator;

/* renamed from: com.facetec.sdk.m0 */
public final /* synthetic */ class C3403m0 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((Size) obj).getHeight() * ((Size) obj).getWidth(), ((Size) obj2).getHeight() * ((Size) obj2).getWidth());
    }
}
