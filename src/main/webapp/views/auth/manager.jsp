<%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/2/22
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<jsp:include page="../main.jsp"/>
<h4>Manager -> </h4>
<div class="row">
    <div class="col-10 offset-1">
        <button type="button" class="btn btn-success" data-toggle="modal" data-target=".bd-example-modal-lg">
            Create Flight
        </button>

        <div class="modal fade bd-example-modal-lg" id="exampleModal" tabindex="-1" role="dialog"
             aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Create Flight</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form method="post" action="/flight/create" enctype="multipart/form-data">
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-6">

                                        <div class="form-group">
                                            <label for="from">From</label>
                                            <input type="text" name="from" class="form-control" id="from"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="to">To</label>
                                            <input type="text" name="to" class="form-control" id="to"/>
                                        </div>
                                        <div class="col-6">
                                            <div class="form-group">
                                                <label for="plane">Plane</label>
                                                <select class="form-control" id="plane" name="plane">
                                                    <option value=

                                                                    <div class="row">
                                                        <c:forEach items="${flight}" var="flight">

                                                        <div class="col-2">
                                                            <div class="card mt-5">
                                                                <div class="card-body">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        </c:forEach>
                                            </div>
                                                    </option>

                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="begin">Begin</label>
                                            <input type="time" name="begin" class="form-control" id="begin"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="end">End</label>
                                            <input type="time" name="end" class="form-control" id="end"/>
                                        </div>

                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
        </div>


    </div>
</div>
</body>
</html>
