/*
* Copyright (c) 2012 Mikael M�ller, Lund Institute of Technology
* Copyright (c) 2012 Per S�rbris, Lund Institute of Technology
* Copyright (c) 2012-2014 Sony Mobile Communications AB.
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*/
package com.sonymobile.wozard.wizard.utils;

import android.graphics.drawable.Drawable;
/**
 * Used by the {@link ImageSpinnerArrayAdapter} to represent items in the spinner
 */
public class NotificationSpinnerItem {

	private String text;
	private Drawable image;

	/**
	 * Creates a new {@link NotificationSpinnerItem} instance
	 * @param text The text of the item
	 * @param image The {@link Drawable} image
	 */
	public NotificationSpinnerItem(String text, Drawable image){
		this.text = text;
		this.image = image;
	}
	
	/**
	 * A function to get the text {@link String} of this {@link NotificationSpinnerItem}
	 * @return the text
	 */
	public String getText(){
		return text;
	}
	/**
	 * A function to get the {@link Drawable} of this {@link NotificationSpinnerItem}
	 * @return the {@link Drawable} 
	 */
	public Drawable getImage(){
		return image;
	}

}
