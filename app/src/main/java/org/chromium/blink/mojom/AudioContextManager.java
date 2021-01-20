
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webaudio/audio_context_manager.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface AudioContextManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AudioContextManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AudioContextManager, AudioContextManager.Proxy> MANAGER = AudioContextManager_Internal.MANAGER;


    void audioContextAudiblePlaybackStarted(
int id);



    void audioContextAudiblePlaybackStopped(
int id);


}
