/*
 * Copyright 2014-2015 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.ui.widget.file;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;

/**
 * Used to get events from {@link FileChooser}.
 * @author Kotcrab
 */
public interface FileChooserListener {
	/** Called when user finished selecting files. */
	void selected (Array<FileHandle> files);

	/**
	 * Called when user finished selecting files. Note that if you are using chooser with multi selection enabled
	 * you should use {@link #selected(Array)} because this will be invoked only for first file selected.
	 * @param file file selected by user
	 */
	void selected (FileHandle file);

	/** Called when selection dialog was canceled by user */
	void canceled ();
}
