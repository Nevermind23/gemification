package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.C2417e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C2417e {

    /* renamed from: a */
    private final InternalRewinder f7641a;

    private static final class InternalRewinder {

        /* renamed from: a */
        private final ParcelFileDescriptor f7642a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f7642a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f7642a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f7642a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C2411a implements C2417e.C2418a {
        /* renamed from: a */
        public Class mo7778a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public C2417e mo7779b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7641a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m9332c() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo7775b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo7774a() {
        return this.f7641a.rewind();
    }
}
