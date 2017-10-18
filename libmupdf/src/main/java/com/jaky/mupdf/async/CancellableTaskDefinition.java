package com.jaky.mupdf.async;

public interface CancellableTaskDefinition <Params, Result>
{
	public Result doInBackground(Params... params);
	public void doCancel();
	public void doCleanup();
}
