/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.ourstreets.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.MapView;
import com.google.samples.apps.ourstreets.R;

/**
 * Holds views for the {@link GalleryAdapter}.
 */
public class GalleryViewHolder extends RecyclerView.ViewHolder {

    public final Context context;
    public final View descriptionContainer;
    public final TextView titleText;
    public final TextView descriptionText;
    public final MapView mapView;

    GalleryViewHolder(View view) {
        super(view);
        context = itemView.getContext();
        descriptionContainer = itemView.findViewById(R.id.container_description);
        titleText = (TextView) itemView.findViewById(R.id.text_title);
        descriptionText = (TextView) itemView.findViewById(R.id.text_description);
        mapView = (MapView) itemView.findViewById(R.id.map_view);
    }
}
