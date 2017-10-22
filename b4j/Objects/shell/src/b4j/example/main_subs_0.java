package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,18);
if (RapidSub.canDelegate("application_error")) return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 18;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,11);
if (RapidSub.canDelegate("appstart")) return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(2048);
main._mainform = _form1;
 BA.debugLineNum = 14;BA.debugLine="MainForm.Show";
Debug.ShouldStop(8192);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}