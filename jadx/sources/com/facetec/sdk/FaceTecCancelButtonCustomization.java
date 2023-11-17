package com.facetec.sdk;

import android.graphics.Rect;

public final class FaceTecCancelButtonCustomization {

    /* renamed from: a */
    ButtonLocation f8592a = ButtonLocation.TOP_LEFT;
    public int customImage = 0;

    /* renamed from: e */
    Rect f8593e = null;

    public enum ButtonLocation {
        TOP_LEFT("Top Left"),
        TOP_RIGHT("Top Right"),
        CUSTOM("Custom"),
        DISABLED("Disabled");
        

        /* renamed from: e */
        private final String f8595e;

        private ButtonLocation(String str) {
            this.f8595e = str;
        }

        public final String toString() {
            return this.f8595e;
        }
    }

    public final Rect getCustomLocation() {
        return this.f8593e;
    }

    public final ButtonLocation getLocation() {
        return this.f8592a;
    }

    public final void setCustomLocation(Rect rect) {
        this.f8593e = rect;
    }

    public final void setLocation(ButtonLocation buttonLocation) {
        if (buttonLocation == null) {
            buttonLocation = ButtonLocation.TOP_LEFT;
        }
        this.f8592a = buttonLocation;
    }
}
