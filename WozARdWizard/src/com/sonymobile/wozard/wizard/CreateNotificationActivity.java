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
package com.sonymobile.wozard.wizard;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.sonymobile.wozard.wizard.fragments.CreateNotificationFragment;
import com.sonymobile.wozard.wizard.fragments.CreateNotificationFragment.CreateNotificationCallback;
import com.sonymobile.wozard.wizard.utils.Util;

public class CreateNotificationActivity extends Activity implements CreateNotificationCallback {
	private CreateNotificationFragment fragment;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		fragment = new CreateNotificationFragment();
		getFragmentManager().beginTransaction().add(android.R.id.content, fragment, CreateNotificationFragment.TAG).commit();
		fragment.registerCallback(this);
		Util.actionBarSetup(this, false, R.string.createNotificationTitle);
	}

	@Override
	public void onSaveButtonClicked() {
		finish();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
			case android.R.id.home:
				finish();
				return true;
		}
		return false;
	}
}
