package za.co.simplitate.useradmin.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.powermock.api.mockito.PowerMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import za.co.simplitate.useradmin.dto.User;
import za.co.simplitate.useradmin.util.IDGenerator;

@RunWith(PowerMockRunner.class)
@PrepareForTest({IDGenerator.class})
public class UserDaoTest {

	// verify static doesnt do what its suppose to do
	@Test
	public void whenCreateUser_thenReturnId() {
		UserDao dao = new UserDao();
		
		mockStatic(IDGenerator.class);
		when(IDGenerator.generateId()).thenReturn(1);
		int result = dao.create(new User());
		
		assertEquals(1, result);
		/*
		 * org.mockito.exceptions.misusing.UnfinishedVerificationException: 
Missing method call for verify(mock) here:
-> at za.co.simplitate.useradmin.dao.UserDaoTest.whenCreateUser_thenReturnId(UserDaoTest.java:27)

Example of correct verification:
    verify(mock).doSomething()

Also, this error might show up because you verify either of: final/private/equals()/hashCode() methods.
Those methods *cannot* be stubbed/verified.
Mocking methods declared on non-public parent classes is not supported.

	at org.junit.runner.notification.SynchronizedRunListener.testFinished(SynchronizedRunListener.java:56)
	at org.junit.runner.notification.RunNotifier$7.notifyListener(RunNotifier.java:190)
	at org.junit.runner.notification.RunNotifier$SafeNotifier.run(RunNotifier.java:72)
	at org.junit.runner.notification.RunNotifier.fireTestFinished(RunNotifier.java:187)
	at org.junit.internal.runners.MethodRoadie.run(MethodRoadie.java:53)
	at org.junit.internal.runners.ClassRoadie.runUnprotected(ClassRoadie.java:34)
	at org.junit.internal.runners.ClassRoadie.runProtected(ClassRoadie.java:44)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at org.junit.vintage.engine.execution.RunnerExecutor.execute(RunnerExecutor.java:40)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.Iterator.forEachRemaining(Iterator.java:116)
	at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
	at org.junit.vintage.engine.VintageTestEngine.executeAllChildren(VintageTestEngine.java:80)
	at org.junit.vintage.engine.VintageTestEngine.execute(VintageTestEngine.java:71)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:229)
	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:197)
	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:211)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:191)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:137)
	at org.eclipse.jdt.internal.junit5.runner.JUnit5TestReference.run(JUnit5TestReference.java:89)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
		 */
//		verifyStatic(IDGenerator.class);
	}

}
