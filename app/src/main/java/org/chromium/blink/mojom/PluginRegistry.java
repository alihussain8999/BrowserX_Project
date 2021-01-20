
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/plugins/plugin_registry.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface PluginRegistry extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PluginRegistry, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PluginRegistry, PluginRegistry.Proxy> MANAGER = PluginRegistry_Internal.MANAGER;


    void getPlugins(
boolean refresh, org.chromium.url.mojom.Origin mainFrameOrigin, 
GetPluginsResponse callback);

    interface GetPluginsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<PluginInfo[]> { }


}
