#pragma checksum "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "f806d4f8b4e2d10f59a5879787666058486c95c2"
// <auto-generated/>
#pragma warning disable 1591
namespace BlazorWebApp.Pages
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
#nullable restore
#line 1 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using System.Net.Http;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#nullable disable
#nullable restore
#line 5 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#nullable disable
#nullable restore
#line 6 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#nullable disable
#nullable restore
#line 7 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#nullable disable
#nullable restore
#line 8 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using BlazorWebApp;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
using BlazorWebApp.Model.Domain;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
using BlazorWebApp.Shared;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
using Microsoft.AspNetCore.Components;

#line default
#line hidden
#nullable disable
    [Microsoft.AspNetCore.Components.RouteAttribute("/items/{Id:int}")]
    public class EditItem : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
            __builder.OpenElement(0, "h1");
            __builder.AddContent(1, "Editing trophy \"");
            __builder.AddContent(2, 
#nullable restore
#line 8 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                     item.name

#line default
#line hidden
#nullable disable
            );
            __builder.AddContent(3, "\"");
            __builder.CloseElement();
            __builder.AddMarkupContent(4, "\r\n\r\n");
            __builder.OpenComponent<Microsoft.AspNetCore.Components.Forms.EditForm>(5);
            __builder.AddAttribute(6, "Model", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.Object>(
#nullable restore
#line 10 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                  item

#line default
#line hidden
#nullable disable
            ));
            __builder.AddAttribute(7, "OnValidSubmit", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<Microsoft.AspNetCore.Components.EventCallback<Microsoft.AspNetCore.Components.Forms.EditContext>>(Microsoft.AspNetCore.Components.EventCallback.Factory.Create<Microsoft.AspNetCore.Components.Forms.EditContext>(this, 
#nullable restore
#line 10 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                                        ValidSubmit

#line default
#line hidden
#nullable disable
            )));
            __builder.AddAttribute(8, "ChildContent", (Microsoft.AspNetCore.Components.RenderFragment<Microsoft.AspNetCore.Components.Forms.EditContext>)((context) => (__builder2) => {
                __builder2.AddMarkupContent(9, "\r\n    ");
                __builder2.OpenComponent<Microsoft.AspNetCore.Components.Forms.DataAnnotationsValidator>(10);
                __builder2.CloseComponent();
                __builder2.AddMarkupContent(11, "\r\n    ");
                __builder2.OpenComponent<Microsoft.AspNetCore.Components.Forms.ValidationSummary>(12);
                __builder2.CloseComponent();
                __builder2.AddMarkupContent(13, "\r\n\r\n    ");
                __builder2.OpenElement(14, "div");
                __builder2.AddAttribute(15, "class", "form-group");
                __builder2.AddMarkupContent(16, "\r\n        ");
                __builder2.AddMarkupContent(17, "<label for=\"name\">Name:</label>\r\n        ");
                __builder2.OpenComponent<Microsoft.AspNetCore.Components.Forms.InputText>(18);
                __builder2.AddAttribute(19, "Class", "form-control");
                __builder2.AddAttribute(20, "id", "name");
                __builder2.AddAttribute(21, "Value", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.String>(
#nullable restore
#line 16 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                                                               item.name

#line default
#line hidden
#nullable disable
                ));
                __builder2.AddAttribute(22, "ValueChanged", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<Microsoft.AspNetCore.Components.EventCallback<System.String>>(Microsoft.AspNetCore.Components.EventCallback.Factory.Create<System.String>(this, Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.CreateInferredEventCallback(this, __value => item.name = __value, item.name))));
                __builder2.AddAttribute(23, "ValueExpression", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.Linq.Expressions.Expression<System.Func<System.String>>>(() => item.name));
                __builder2.CloseComponent();
                __builder2.AddMarkupContent(24, "\r\n        ");
                __Blazor.BlazorWebApp.Pages.EditItem.TypeInference.CreateValidationMessage_0(__builder2, 25, 26, 
#nullable restore
#line 17 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                                  () => item.name

#line default
#line hidden
#nullable disable
                );
                __builder2.AddMarkupContent(27, "\r\n    ");
                __builder2.CloseElement();
                __builder2.AddMarkupContent(28, "\r\n    ");
                __builder2.OpenElement(29, "div");
                __builder2.AddAttribute(30, "class", "form-group");
                __builder2.AddMarkupContent(31, "\r\n        ");
                __builder2.AddMarkupContent(32, "<label for=\"source\">Source:</label>\r\n        ");
                __builder2.OpenComponent<Microsoft.AspNetCore.Components.Forms.InputText>(33);
                __builder2.AddAttribute(34, "Class", "form-control");
                __builder2.AddAttribute(35, "id", "source");
                __builder2.AddAttribute(36, "Value", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.String>(
#nullable restore
#line 21 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                                                                 item.url

#line default
#line hidden
#nullable disable
                ));
                __builder2.AddAttribute(37, "ValueChanged", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<Microsoft.AspNetCore.Components.EventCallback<System.String>>(Microsoft.AspNetCore.Components.EventCallback.Factory.Create<System.String>(this, Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.CreateInferredEventCallback(this, __value => item.url = __value, item.url))));
                __builder2.AddAttribute(38, "ValueExpression", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.Linq.Expressions.Expression<System.Func<System.String>>>(() => item.url));
                __builder2.CloseComponent();
                __builder2.AddMarkupContent(39, "\r\n    ");
                __builder2.CloseElement();
                __builder2.AddMarkupContent(40, "\r\n    ");
                __builder2.AddMarkupContent(41, "<div class=\"form-group\">\r\n        <label for=\"url\">Cool Factor:</label>\r\n\r\n    </div>\r\n\r\n    ");
                __builder2.AddMarkupContent(42, "<button type=\"submit\" class=\"btn btn-primary\">Save Changes</button>\r\n    ");
                __builder2.OpenElement(43, "button");
                __builder2.AddAttribute(44, "class", "btn btn-secondary");
                __builder2.AddAttribute(45, "onclick", Microsoft.AspNetCore.Components.EventCallback.Factory.Create<Microsoft.AspNetCore.Components.Web.MouseEventArgs>(this, 
#nullable restore
#line 29 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
                                                Cancel

#line default
#line hidden
#nullable disable
                ));
                __builder2.AddContent(46, "Cancel");
                __builder2.CloseElement();
                __builder2.AddMarkupContent(47, "\r\n");
            }
            ));
            __builder.CloseComponent();
        }
        #pragma warning restore 1998
#nullable restore
#line 32 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\EditItem.razor"
       
    [Parameter]
    public int Id { get; set; }

    Item item { get; set; }

    protected override void OnInitialized()
    {
        item = DataLayer.TrophyForEditing(Id);
    }

    void BackToList()
    {
        NavigationManager.NavigateTo("/items");
    }

    void Cancel()
    {
        BackToList();
    }

    void ValidSubmit()
    {
        DataLayer.SubmitChanges(item);
        BackToList();
    }

#line default
#line hidden
#nullable disable
        [global::Microsoft.AspNetCore.Components.InjectAttribute] private NavigationManager NavigationManager { get; set; }
        [global::Microsoft.AspNetCore.Components.InjectAttribute] private IDataLayer DataLayer { get; set; }
    }
}
namespace __Blazor.BlazorWebApp.Pages.EditItem
{
    #line hidden
    internal static class TypeInference
    {
        public static void CreateValidationMessage_0<TValue>(global::Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder, int seq, int __seq0, global::System.Linq.Expressions.Expression<global::System.Func<TValue>> __arg0)
        {
        __builder.OpenComponent<global::Microsoft.AspNetCore.Components.Forms.ValidationMessage<TValue>>(seq);
        __builder.AddAttribute(__seq0, "For", __arg0);
        __builder.CloseComponent();
        }
    }
}
#pragma warning restore 1591
