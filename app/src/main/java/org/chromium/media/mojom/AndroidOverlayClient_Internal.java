
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/android_overlay.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class AndroidOverlayClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AndroidOverlayClient, AndroidOverlayClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AndroidOverlayClient, AndroidOverlayClient.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.AndroidOverlayClient";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, AndroidOverlayClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public AndroidOverlayClient[] buildArray(int size) {
          return new AndroidOverlayClient[size];
        }
    };


    private static final int ON_SURFACE_READY_ORDINAL = 0;

    private static final int ON_DESTROYED_ORDINAL = 1;

    private static final int ON_POWER_EFFICIENT_STATE_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AndroidOverlayClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onSurfaceReady(
long surfaceKey) {

            AndroidOverlayClientOnSurfaceReadyParams _message = new AndroidOverlayClientOnSurfaceReadyParams();

            _message.surfaceKey = surfaceKey;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SURFACE_READY_ORDINAL)));

        }


        @Override
        public void onDestroyed(
) {

            AndroidOverlayClientOnDestroyedParams _message = new AndroidOverlayClientOnDestroyedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_DESTROYED_ORDINAL)));

        }


        @Override
        public void onPowerEfficientState(
boolean isPowerEfficient) {

            AndroidOverlayClientOnPowerEfficientStateParams _message = new AndroidOverlayClientOnPowerEfficientStateParams();

            _message.isPowerEfficient = isPowerEfficient;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_POWER_EFFICIENT_STATE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AndroidOverlayClient> {

        Stub(org.chromium.mojo.system.Core core, AndroidOverlayClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                AndroidOverlayClient_Internal.MANAGER, messageWithHeader);





                    case ON_SURFACE_READY_ORDINAL: {

                        AndroidOverlayClientOnSurfaceReadyParams data =
                                AndroidOverlayClientOnSurfaceReadyParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSurfaceReady(data.surfaceKey);
                        return true;
                    }





                    case ON_DESTROYED_ORDINAL: {

                        AndroidOverlayClientOnDestroyedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onDestroyed();
                        return true;
                    }





                    case ON_POWER_EFFICIENT_STATE_ORDINAL: {

                        AndroidOverlayClientOnPowerEfficientStateParams data =
                                AndroidOverlayClientOnPowerEfficientStateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onPowerEfficientState(data.isPowerEfficient);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), AndroidOverlayClient_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class AndroidOverlayClientOnSurfaceReadyParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public long surfaceKey;

        private AndroidOverlayClientOnSurfaceReadyParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AndroidOverlayClientOnSurfaceReadyParams() {
            this(0);
        }

        public static AndroidOverlayClientOnSurfaceReadyParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AndroidOverlayClientOnSurfaceReadyParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AndroidOverlayClientOnSurfaceReadyParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AndroidOverlayClientOnSurfaceReadyParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AndroidOverlayClientOnSurfaceReadyParams(elementsOrVersion);
                    {
                        
                    result.surfaceKey = decoder0.readLong(8);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.surfaceKey, 8);
        }
    }



    
    static final class AndroidOverlayClientOnDestroyedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private AndroidOverlayClientOnDestroyedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AndroidOverlayClientOnDestroyedParams() {
            this(0);
        }

        public static AndroidOverlayClientOnDestroyedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AndroidOverlayClientOnDestroyedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AndroidOverlayClientOnDestroyedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AndroidOverlayClientOnDestroyedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AndroidOverlayClientOnDestroyedParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class AndroidOverlayClientOnPowerEfficientStateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean isPowerEfficient;

        private AndroidOverlayClientOnPowerEfficientStateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AndroidOverlayClientOnPowerEfficientStateParams() {
            this(0);
        }

        public static AndroidOverlayClientOnPowerEfficientStateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AndroidOverlayClientOnPowerEfficientStateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AndroidOverlayClientOnPowerEfficientStateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AndroidOverlayClientOnPowerEfficientStateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AndroidOverlayClientOnPowerEfficientStateParams(elementsOrVersion);
                    {
                        
                    result.isPowerEfficient = decoder0.readBoolean(8, 0);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.isPowerEfficient, 8, 0);
        }
    }



}
