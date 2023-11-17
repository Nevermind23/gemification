package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzll extends IOException {
    public zzll(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzlk m17327a() {
        return new zzlk("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static zzll m17328b() {
        return new zzll("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static zzll m17329c() {
        return new zzll("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static zzll m17330d() {
        return new zzll("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static zzll m17331e() {
        return new zzll("Failed to parse the message.");
    }

    /* renamed from: f */
    static zzll m17332f() {
        return new zzll("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
