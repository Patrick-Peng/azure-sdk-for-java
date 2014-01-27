/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineImageCreateParameters;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineImageCreateResponse;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineImageGetResponse;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineImageListResponse;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineImageUpdateParameters;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineImageUpdateResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* The Service Management API includes operations for managing the OS images in
* your subscription.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/jj157175.aspx for more
* information)
*/
public interface VirtualMachineImageOperations
{
    /**
    * The Add OS Image operation adds an operating system image that is stored
    * in a storage account and is available from the image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157192.aspx for
    * more information)
    *
    * @param parameters Parameters supplied to the Create Virtual Machine Image
    * operation.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return Parameters returned from the Create Virtual Machine Image
    * operation.
    */
    VirtualMachineImageCreateResponse create(VirtualMachineImageCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException, ParserConfigurationException, SAXException, TransformerException, ServiceException, URISyntaxException;
    
    /**
    * The Add OS Image operation adds an operating system image that is stored
    * in a storage account and is available from the image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157192.aspx for
    * more information)
    *
    * @param parameters Parameters supplied to the Create Virtual Machine Image
    * operation.
    * @return Parameters returned from the Create Virtual Machine Image
    * operation.
    */
    Future<VirtualMachineImageCreateResponse> createAsync(VirtualMachineImageCreateParameters parameters);
    
    /**
    * The Delete OS Image operation deletes the specified OS image from your
    * image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157203.aspx for
    * more information)
    *
    * @param imageName The name of the image to delete.
    * @param deleteFromStorage Optional. Specifies that the source blob for the
    * image should also be deleted from storage.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String imageName, boolean deleteFromStorage) throws IOException, ServiceException, InterruptedException, ExecutionException, ServiceException;
    
    /**
    * The Delete OS Image operation deletes the specified OS image from your
    * image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157203.aspx for
    * more information)
    *
    * @param imageName The name of the image to delete.
    * @param deleteFromStorage Optional. Specifies that the source blob for the
    * image should also be deleted from storage.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String imageName, boolean deleteFromStorage);
    
    /**
    * The Get OS Image operation retrieves the details for an operating system
    * image from the image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157191.aspx for
    * more information)
    *
    * @param imageName The name of the OS image to retrieve.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return A virtual machine image associated with your subscription.
    */
    VirtualMachineImageGetResponse get(String imageName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The Get OS Image operation retrieves the details for an operating system
    * image from the image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157191.aspx for
    * more information)
    *
    * @param imageName The name of the OS image to retrieve.
    * @return A virtual machine image associated with your subscription.
    */
    Future<VirtualMachineImageGetResponse> getAsync(String imageName);
    
    /**
    * The List OS Images operation retrieves a list of the operating system
    * images from the image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157191.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List OS Images operation response.
    */
    VirtualMachineImageListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The List OS Images operation retrieves a list of the operating system
    * images from the image repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157191.aspx for
    * more information)
    *
    * @return The List OS Images operation response.
    */
    Future<VirtualMachineImageListResponse> listAsync();
    
    /**
    * The Update OS Image operation updates an OS image that in your image
    * repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157198.aspx for
    * more information)
    *
    * @param imageName The name of the virtual machine image to be updated.
    * @param parameters Parameters supplied to the Update Virtual Machine Image
    * operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @return Parameters returned from the Create Virtual Machine Image
    * operation.
    */
    VirtualMachineImageUpdateResponse update(String imageName, VirtualMachineImageUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, URISyntaxException, InterruptedException, ExecutionException, ServiceException;
    
    /**
    * The Update OS Image operation updates an OS image that in your image
    * repository.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157198.aspx for
    * more information)
    *
    * @param imageName The name of the virtual machine image to be updated.
    * @param parameters Parameters supplied to the Update Virtual Machine Image
    * operation.
    * @return Parameters returned from the Create Virtual Machine Image
    * operation.
    */
    Future<VirtualMachineImageUpdateResponse> updateAsync(String imageName, VirtualMachineImageUpdateParameters parameters);
}
