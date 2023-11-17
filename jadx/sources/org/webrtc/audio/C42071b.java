package org.webrtc.audio;

import android.media.audiofx.AudioEffect;
import java.util.UUID;
import org.webrtc.Logging;

/* renamed from: org.webrtc.audio.b */
class C42071b {

    /* renamed from: a */
    private static final UUID f98954a = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");

    /* renamed from: b */
    private static final UUID f98955b = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    /* renamed from: c */
    private static AudioEffect.Descriptor[] f98956c;

    public C42071b() {
        Logging.m122183b("WebRtcAudioEffectsExternal", "ctor" + C42073d.m122224a());
    }

    /* renamed from: a */
    private static AudioEffect.Descriptor[] m122218a() {
        AudioEffect.Descriptor[] descriptorArr = f98956c;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        f98956c = queryEffects;
        return queryEffects;
    }

    /* renamed from: b */
    public static boolean m122219b() {
        return m122220c(AudioEffect.EFFECT_TYPE_AEC, f98954a);
    }

    /* renamed from: c */
    private static boolean m122220c(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] a = m122218a();
        if (a == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : a) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m122221d() {
        return m122220c(AudioEffect.EFFECT_TYPE_NS, f98955b);
    }
}
