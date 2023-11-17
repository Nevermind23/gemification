package com.medallia.digital.mobilesdk;

public enum MDAppearanceMode {
    light,
    dark,
    unknown;

    protected static MDAppearanceMode fromString(String str) {
        MDAppearanceMode mDAppearanceMode = dark;
        if (mDAppearanceMode.name().equals(str)) {
            return mDAppearanceMode;
        }
        MDAppearanceMode mDAppearanceMode2 = light;
        return mDAppearanceMode2.name().equals(str) ? mDAppearanceMode2 : unknown;
    }
}
